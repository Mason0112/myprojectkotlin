import org.example.Student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest{

    @Test
    fun highestTest(){
        val stu = Student("Mason", 60, 97)
        Assertions.assertEquals(97, stu.highest())
    }

    @Test
    fun averageTest(){
        val stu = Student("Mason", 60, 97)
        Assertions.assertEquals((60+97)/2F, stu.getAverage())
    }

    @Test
    fun gradingTest(){
        val stu = Student("Mason", 60, 97)
        Assertions.assertEquals('C', stu.grading())
    }
}