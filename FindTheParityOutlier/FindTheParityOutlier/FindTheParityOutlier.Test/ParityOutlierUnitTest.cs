namespace FindTheParityOutlier.Test
{
    [TestClass]
    public class ParityOutlierUnitTest
    {
        [TestMethod]
        [DataRow(new int[] { 160, 3, 1719, 19, 11, 13, -21 }, 160)]
        public void ParityOutlier_OddNumbers_ReturnsEvenNumber(int[] testExamples, int expectedResult)
        {
            int result = ParityOutlier.Find(testExamples);
            Assert.IsTrue(expectedResult == result);
        }

        [TestMethod]
        [DataRow(new int[] { 2, 4, 0, 100, 4, 11, 2602, 36 }, 11)]
        [DataRow(new int[] { 2, 6, 8, -10, 3 }, 3)]
        public void ParityOutlier_EvenNumbers_ReturnsOddNumber(int[] testExamples, int expectedResult)
        {
            int result = ParityOutlier.Find(testExamples);
            Assert.IsTrue(expectedResult == result);
        }
    }
}