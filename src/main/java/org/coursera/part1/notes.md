#Divide and Conquer, Sorting and Searching, and Randomized Algorithms

> The Algorithm Designer’s Mantra
> CAN WE DO BETTER?


#Master Method

## Recurrence Format

> T(n) = aT(n/b) + O(n<sup>d</sup>)

###where
- a = number of recursive calls (>= 1)
- b = input size shrinkage factor ( > 1)
- d = exponent in running Fme of “combine step” (>=0) [a,b,d independent of n ]

###Then

> T(n) = n<sup>d</sup> * log n        if a = b<sup>d</sup> . This signifies work done at each level is equal
 
> T(n) = n<sup>d</sup> if a < b<sup>d</sup>. This signifies work done at top level is maximum

> T(n) = n<sup>log<sub>b</sub>a</sup>    if a > b<sup>d</sup>. This signifies work done at leaf nodes is maximum


a is called Rate of Proliferation

b <sup>d</sup> is called Rate of Shrinkage