package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayListTest {
    List arrayList;

    @BeforeEach
    void setUp(){
        arrayList = new ArrayList();
    }

    @Test
    public void testThatNewListIsEmpty(){
        arrayList.isEmpty();
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testThatAddItemListNotEmpty(){
        arrayList.add("human hair");
        assertFalse(arrayList.isEmpty());
    }

    @Test
    void addItemIsNotEmpty_SizeIsOne(){
        arrayList.add("human hair");
        assertEquals(1, arrayList.size());
    }

    @Test
    void addItem_GetByIndex(){
        arrayList.add("human hair");
        String savedItem = arrayList.get(0);
        assertEquals("human hair", savedItem);
    }

    @Test
    void addXYgetXY(){
        arrayList.add("human hair");
        arrayList.add("shoe");
        assertEquals("human hair", arrayList.get(0));
        assertEquals("shoe", arrayList.get(1));
    }

    @Test
    void addXYremoveXYSizeIsOneTest(){
        arrayList.add("Item-1");
        arrayList.add("Item-2");
        arrayList.remove(0);
        assertNull(arrayList.get(0));
        assertEquals(1, arrayList.size());
    }
    @Test
    void addXYremoveYFindByIndexIsNullTest(){
        arrayList.add("Item-1");
        arrayList.add("Item-2");
        arrayList.remove(1);
        String deletedItem = arrayList.get(1);
        assertNull(deletedItem);
    }
    @Test
    void addXToIndex_ListIsNotEmpty(){
        arrayList.add(0, "Item-1");
        assertFalse(arrayList.isEmpty());
    }
    @Test
    void addItemToIndex_SizeIsOne(){
        arrayList.add(0, "Item 1");
        assertEquals(1, arrayList.size());
    }
    @Test
    void addItemToIndex_GetByIndex(){
        arrayList.add(0, "Item-1");
        String savedItem = arrayList.get(0);
        assertEquals("Item-1", savedItem);
    }
    @Test
    void addXYtoIndexGetXY(){
        arrayList.add(0, "Item-1");
        arrayList.add(1, "Item-2");
        assertEquals("Item-1", arrayList.get(0));
        assertEquals("Item-2", arrayList.get(1));
    }
    @Test
    void addToAParticularIndex(){
        arrayList.add(0, "Item-1");
        arrayList.add(1, "Item-2");
        arrayList.add(2, "Item-3");
        arrayList.add(2, "Item-4");
        arrayList.add(4, "Item-5");
        assertEquals("Item-5", arrayList.get(4));
        //assertEquals(5, list.size());
    }
    @Test
    void addXYtoIndexRemoveXY_SizeIsOneTest(){
        arrayList.add("Item-1");
        arrayList.add("Item-2");
        arrayList.remove(0);
        assertEquals(1, arrayList.size());
    }
    @Test
    void addXYremoveYByName_FindByIndexIsNullTest(){
        arrayList.add("Item-1");
        arrayList.add("Item-2");
        arrayList.remove("Item-1");
        String deletedItem = arrayList.get(0);
        assertNull(deletedItem);
    }

    @Test
    void addXY_replaceY(){
        arrayList.add("Item-1");
        arrayList.add("Item-2");
        arrayList.set(1, "New_item");
        assertEquals("New_item", arrayList.get(1));
    }
    @Test
    void testThatArrayContainsX(){
        arrayList.add("Item-1");
        assertTrue(arrayList.contains("Item-1"));
    }
    @Test
    void testThatArrayContainsXY(){
        arrayList.add("Item-1");
        arrayList.add("Item-2");
        assertTrue(arrayList.contains("Item-2"));
        assertTrue(arrayList.contains("Item-1"));
    }
    @Test
    void testThatArrayIsEmpty_AfterClearing(){
        arrayList.add("Item-1");
        arrayList.add("Item-2");
        arrayList.clear();
        assertTrue(arrayList.isEmpty());
    }
    @Test
    void testThatSizeIsZeroAfterClearingArray(){
        arrayList.add("Item-1");
        arrayList.add("Item-2");
        arrayList.clear();
        assertEquals(0, arrayList.size());
    }
    @Test
    void testThatXYDoesNotExistAfterClearingArray(){
        arrayList.add("Item-1");
        arrayList.add("Item-2");
        arrayList.clear();
        assertNull(arrayList.get(0));
        assertNull(arrayList.get(1));
    }
}
