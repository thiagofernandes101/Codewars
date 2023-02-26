namespace StringEndsWith
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(Kata.Solution("samurai", "ai"));
            Console.WriteLine(Kata.Solution("sumo", "omo"));
            Console.WriteLine(Kata.Solution("ninja", "ja"));
            Console.WriteLine(Kata.Solution("sensei", "i"));
            Console.WriteLine(Kata.Solution("samurai", "ra"));
            Console.WriteLine(Kata.Solution("abc", "abcd"));
            Console.WriteLine(Kata.Solution("abc", "abc"));
            Console.WriteLine(Kata.Solution("abcabc", "bc"));
            Console.WriteLine(Kata.Solution("ails", "fails"));
            Console.WriteLine(Kata.Solution("fails", "ails"));
            Console.WriteLine(Kata.Solution("this", "fails"));
            Console.WriteLine(Kata.Solution("abc", ""));
            Console.WriteLine(Kata.Solution(":-)", ":-("));
            Console.WriteLine(Kata.Solution("!@#$%^&*() :-)", ":-)"));
            Console.WriteLine(Kata.Solution("abc\n", "abc"));
        }
    }
}