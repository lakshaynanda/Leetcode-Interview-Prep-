class Solution:
    def numPairsDivisibleBy60(self, time: List[int]) -> int:
        modCount = collections.Counter(duration % 60 for duration in time)
        return (math.comb(modCount[0], 2) + math.comb(modCount[30], 2) +
                sum(modCount[i] * modCount[60 - i] for i in range(1, 30)))