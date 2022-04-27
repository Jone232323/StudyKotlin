import org.junit.Assert.*

class StudyKotlinKtTest {

    @org.junit.Test
    fun useInsertSort() {

        val actual:Array<Int> = arrayOf(2,4,5,6,1,8,9,7,3)
        val expected:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)

        useInsertSort(actual)

        assertTrue(expected contentEquals actual)
    }

    @org.junit.Test
    fun useInsertSort_1() {

        val actual:Array<Int> = arrayOf(0,0,0,0,0,0,9,0,0)
        val expected:Array<Int> = arrayOf(0,0,0,0,0,0,0,0,9)

        useInsertSort(actual)

        assertTrue(expected contentEquals actual)
    }


    @org.junit.Test
    fun useInsertSort_2() {

        val actual:Array<Int> = arrayOf(9,8,7,6,5,4,3,2,1)
        val expected:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)

        useInsertSort(actual)

        assertTrue(expected contentEquals actual)
    }

}