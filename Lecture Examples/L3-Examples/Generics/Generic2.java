import java.util.*;

public class Generic2 {

    // Case 1
    public void foo(ArrayList<Point> plist) {
	for (Point p : plist) {
	    System.out.println("foo: " + p);
	}
    }

    // Case 2: <?> is a wildcard
    public void bar(ArrayList<?> plist) {
	for (Object o : plist) {
	    System.out.println("bar: " + o);
	}
    }

    // Case 3: <? extends Point> is a bounded wildcard
    public void baz(ArrayList<? extends Point> plist) {
	for (Point p : plist) {
	    System.out.println("baz: " + p);
	}
    }
    
    public void foobar(Point[] ps) {
	for (Point p : ps) {
	    System.out.println("foobar: " + p);
	}
    }
    
    //    @SuppressWarnings("unchecked") 
    public static void main(String[] args) {

	Generic2 g = new Generic2();

	ArrayList list1 = new ArrayList();
        list1.add(new Point(10, 10));
	list1.add(new Point(20, 20));
        Point p1 = (Point)list1.get(0);
	System.out.println("1 : " + p1);

	ArrayList<Point> list2 = new ArrayList<Point>();
	list2.add(new Point(1, 1));
	list2.add(new Point(2, 2));
	g.foo(list2);
	Point p2 = list2.get(0);
	System.out.println("2 : " + p2);


        ArrayList<Point3> list3 = new ArrayList<Point3>();
	list3.add(new Point3(11, 11, 11));
	list3.add(new Point3(22, 22, 22));
        g.foo(list2);          // Line 0 
        //      g.foo(list3);  // Line 1
        g.bar(list3);          // Line 2
        g.baz(list3);          // Line 3

        // Arrays are different.
        Point3[] p3s = new Point3[3];
        p3s[0] = new Point3(111, 111, 111);
        p3s[1] = new Point3(222, 222, 222);
        p3s[2] = new Point3(333, 333, 333);
        g.foobar(p3s);
    }

}

/*
 Line 0 works as expected.
 
 Line 1 would not work because ArrayList<Point> is not a supertype of
 ArrayList<Point3> although Point is a supertype of Point3.

 Line 2 and Line 3 would work though.

 The difference between Line 1 and Line 3 is clear, I hope.
 If not, read further below.
 Even if it is, still read the rest of this file.
 
 */

/*
Case 3: Subtyping and wildcards

Suppose we wrote baz like this with the intent to pass an ArrayList<Point>
as well as an ArrayList<Point3> (Remember: Point3 is a subclass of Point):

    public void baz(ArrayList<Point> plist) {
	for (Point p : plist) {
	    System.out.println("baz: " + p);
	}
    }

    But that is not what the parameterized type ArrayList<Point> means.
    It means an object compatible with ArrayList that has elements declared
    to be Point.  If you try to invoke baz with an ArrayList<Point3>, for
    example, your code will not compile.

       ArrayList<Point3> p3s = new ArrayList<Point3>();
       p3s.add(new Point3(11, 11, 11));
       p3s.add(new Point3(22, 22, 22));
       baz(p3s);  // INVALID: won't compile

    The problem is that even though Point3 is a subtype of Point,
    ArrayList<Point3> is not a subtype of ArrayList<Point>.
    Contrast this with arrays, where Point3[] is a subtype of Point[].

    We need a way to declare an ArrayList of an arbitrary element that is
    compatible with Point, and the way to do that is to use the type
    argument wildcard '?':

    public void baz(ArrayList<? extends Point> plist) {
	for (Point p : plist) {
	    System.out.println("baz: " + p);
	}
    }

    In this example, the wildcard indicates that we require an ArrayList of
    any type, as long as that type is Point or a subclass of Point.

    More formally, we have used a bounded wildcard, where Point forms the
    upper bound on the type that is expected: Whatever we get, it must be
    at least a Point.

    You can also specify that a wildcard type must be the same as, or a
    supertype of, another.  You do this by using the keyword 'super' rather
    than 'extends'.  For example, you could use ArrayList<? super Point3>
    to match an ArrayList<Point3> or any of its supertypes:
    ArrayList<Point>, ArrayList<Serializable>, ArrayList<Comparable<Point3>>,
    or ArrayList<Object>.  In this case the type represents the lower bound
    on the wildcard's type.

    Of course, you can also have an unbounded wildcard. (Case 2) For example,
    ArrayList<?> represents an ArrayList of any kind - implicitly the upper
    bound is Object.  But remember that ArrayList<?> is not another way
    of saying ArrayList<Object>; rather it is a way of saying
    ArrayList<? extends Object>.

    In contrast to the non-wildcard versions, parameterized types that include
    a bounded wildcard are related in the way you might have expected.
    For example, ArrayList<? extends Point3> is a subtype of
    ArrayList<? extends Point>, which is itself a subtype of ArrayList<?>.

    Similarly, ArrayList<? super Point> is a subtype of
    ArrayList<? super Point3>.

    In addition, non-wildcard parameterized types are subtypes of suitably
    bounded, wildcard parameterized types.  For example, ArrayList<Point>
    is a subtype of ArrayList<? extends Point>, as is ArrayList<Point3>.
    While this in itself is a good property to have, the difference between
    the behavior with and without bounded wildcards can be a source of
    confusion.  Perhaps the following diagram will clarify things:

                        ArrayList<?>
                   /                    \
                 /                        \
       ArrayList<Object>             ArrayList<? extends Point>
                                    /                      \
                                  /                         \
                        ArrayList<? extends Point3>     ArrayList<Point3>
                                 |
                                 |
                       ArrayList<Point3>

    These properties of wildcards make them not only useful but essential
    for effective use of generic types.  Whenever a method takes a parameter
    that is a parameterized type or returns a parameterized type, that
    parameterized type should almost always be expressed with a wildcard of
    some form.  Typically, parameters use lower-bounded wildcards, while
    return values use upper-bounded wildcards.
 */