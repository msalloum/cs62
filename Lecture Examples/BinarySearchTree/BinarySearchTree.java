// BinarySearchTree class (note it will create an unbalanced tree)

public class BinarySearchTree<T extends Comparable<T>> {
    
    /** The tree root. */
    protected BTNode<T> root;
    
    public BinarySearchTree( ) {
        root = null;
    }
    
    /* Insert into the tree. */
    public void insert( T x ) {
        root = insert( x, root );
    }
    
    /* Remove from the tree. */
    public void remove( T x ) {
        root = remove( x, root );
    }
    
    /* Remove minimum item from the tree. */
    public void removeMin( ) {
        root = removeMin( root );
    }
    
    /* Find the smallest item in the tree. */
    public T findMin( ) {
        return elementAt( findMin( root ) );
    }
    
    /* Find the largest item in the tree. */
    public T findMax( ) {
        return elementAt( findMax( root ) );
    }
    
    /* Find an item in the tree. */
    public T find( T x ) {
        return elementAt( find( x, root ) );
    }
    
    /* Make the tree logically empty. */
    public void makeEmpty( ) {
        root = null;
    }
    
    /* Test if the tree is logically empty.  */
    public boolean isEmpty( ) {
        return root == null;
    }
    
    public void printPreOrder(){
    	 printPreOrder(root);
    }
    
    private void printPreOrder( BTNode<T> t ){
    	if (t == null)
    		return;
    	BTNode<T> current = t;
    	
    	System.out.print(current.data + " ");
    	printPreOrder(t.left);
    	printPreOrder(t.right);
 
    	System.out.println();
    }
    
    /* Internal method to get element field. */
    private T elementAt( BTNode<T> t ) {
        return t == null ? null : t.data;
    }
    
    /* Internal method to insert into a subtree. */
    protected BTNode<T> insert( T x, BTNode<T> t ) {
        if( t == null )
            t = new BTNode<T>( x );
        else if( x.compareTo( t.data ) <= 0 )
            t.left = insert( x, t.left );
        else if( x.compareTo( t.data ) > 0 )
            t.right = insert( x, t.right );
        return t;
    }
    
    /* Internal method to remove from a subtree. */
    protected BTNode<T> remove( T x, BTNode<T> t ) {
        if( t == null )
            return null;
        if( x.compareTo( t.data ) < 0 )
            t.left = remove( x, t.left );
        else if( x.compareTo( t.data ) > 0 )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ) // Two children
        {
            t.data = findMin( t.right ).data;
            t.right = removeMin( t.right );
        } else
            t = ( t.left != null ) ? t.left : t.right;
        return t;
    }
    
    /* Internal method to remove minimum item from a subtree. */
    protected BTNode<T> removeMin( BTNode<T> t )  {
        if( t == null )
            return null;
        else if( t.left != null ) {
            t.left = removeMin( t.left );
            return t;
        } else
            return t.right;
    }
    
    /* Internal method to find the smallest item in a subtree. */
    protected BTNode<T> findMin( BTNode<T> t ) {
        if( t != null )
            while( t.left != null )
                t = t.left;
        
        return t;
    }
    
    /* Internal method to find the largest item in a subtree. */
    private BTNode<T> findMax( BTNode<T> t ) {
        if( t != null )
            while( t.right != null )
                t = t.right;
        
        return t;
    }
    
    /* Internal method to find an item in a subtree. */
    private BTNode<T> find( T x, BTNode<T> t ) {
        while( t != null ) {
            if( x.compareTo( t.data) < 0 )
                t = t.left;
            else if( x.compareTo( t.data ) > 0 )
                t = t.right;
            else
                return t;    // Match
        }
        
        return null;         // Not found
    }
    
    
    
    
    // Test program
    public static void main( String [ ] args ) 
    {
        BinarySearchTree<Integer> t = new BinarySearchTree<Integer>( );
        
        System.out.println( "Checking... (no more output means success)" );
        
        for( int i = 0; i < 20; i++ )
            t.insert( new Integer( i ) );
        
        for( int i = 1; i < 20; i+= 2 )
            t.remove( new Integer( i ) );
        
        t.printPreOrder();

    }
}

