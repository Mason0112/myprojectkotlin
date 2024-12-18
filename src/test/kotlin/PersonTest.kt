import org.example.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest{

    @Test
    fun bmiTest() {

        val Person = Person("Jack",66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),Person.bmi())

     }




}