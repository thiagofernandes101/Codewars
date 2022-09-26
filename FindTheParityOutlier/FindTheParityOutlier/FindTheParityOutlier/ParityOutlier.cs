using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FindTheParityOutlier
{
    public class ParityOutlier
    {
        public static int Find(int[] integers)
        {
            List<int> numbers = integers.ToList();
            List<int> evenNumbers = numbers.Where(number => number % 2 == 0).ToList();
            List<int> oddNumbers = numbers.Where(number => number % 2 != 0).ToList();
            return evenNumbers.Count() == 1 ? evenNumbers[0] : oddNumbers[0];
        }
    }
}
