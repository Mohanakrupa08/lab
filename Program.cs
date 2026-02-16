using System;

class Program
{
    static string ReverseDigits(string s)
    {
        char[] a = s.ToCharArray();
        Array.Reverse(a);
        return new string(a);
    }

    static void Main()
    {
        Console.Write("Enter an integer: ");
        string input = Console.ReadLine()?.Trim();
        if (string.IsNullOrEmpty(input)) { Console.WriteLine("No input"); return; }

        bool negative = input.StartsWith("-");
        string digits = negative ? input.Substring(1) : input;
        // remove leading zeros after reversing
        string reversed = ReverseDigits(digits).TrimStart('0');
        if (reversed == "") reversed = "0";
        if (negative) reversed = "-" + reversed;
        Console.WriteLine("Reversed: " + reversed);
    }
}
