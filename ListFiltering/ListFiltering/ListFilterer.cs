namespace ListFiltering
{
    public static class ListFilterer
    {
        public static IEnumerable<int> GetIntegersFromList(List<object> listOfItems)
        {
            List<int> result = new List<int>();

            listOfItems.ForEach(item =>
            {
                if (item is int @int)
                    result.Add(@int);
            });

            return result;

            // Better answer
            //return listOfItems.OfType<int>();
        }
    }
}
