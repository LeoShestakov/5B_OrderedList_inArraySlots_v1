/**
  test OrderedList
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

        addOne( "populate an empty list"
               , 0
               ,"[0,]"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,-10,]"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,-10,5,]"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,]"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,]"
               );

        getOne( "retreive the element at index 4"
               , 4
               , "5"
               );
			   
		removeOne( "remove the first element"
               , 0
               ,"[0,0,2,5,]"
               );
		removeOne( "remove a duplicate element"
               , 1
               ,"[0,2,5,]"
               );
    }

    
    /**
      run one test
     */
    private static void addOne( String description
                              , int value
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.add( value);

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
    }

	/**
      run one test
     */
    private static void getOne( String description
                              , int index
                              , String expect
                              ) {
        System.out.println( description);

        // check 
        System.out.println( 
            "result:   "
          + orderedList.get( index)
          + " ...expecting "
          + expect
          + System.lineSeparator());
    }
	
	/**
      run one test
     */
    private static void removeOne( String description
                                 , int index
                                 , String expect
                                 ) {
        System.out.println( description);
        orderedList.remove(index);

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
    }
}    
