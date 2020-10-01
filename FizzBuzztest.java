public class FizzBuzzTest 
{
@Test
public void test()
{ 
FizzBuzz FizzBuzz = new FizzBuzz();

Assert.assertEquals(expected:"1", FizzBuzz.action(input:1));

Assert.assertEquals(expected:"2", FizzBuzz.action(input:2));

Assert.assertEquals(expected:"Fizz", FizzBuzz.action(input:3));

Assert.assertEquals(expected:"4", FizzBuzz.action(input:4));

Assert.assertEquals(expected:"Bizz", FizzBuzz.action(input:5));

Assert.assertEquals(expected:"Fizz", FizzBuzz.action(input:6));

Assert.assertEquals(expected:"FizzBizz", FizzBuzz.action(input:15));

}
}


public string action (int input)
{ 

if (input % 15 == 0)
   return "FizzBizz";

if (input % 3 == 0)
   return "Fizz";

if (input % 5 == 0)
   return "Bizz";

return input + "";
}



