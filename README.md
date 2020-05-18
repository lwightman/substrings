##Longest Repeating Substring

### My Solution
I put out a brute force method that I believe is O(n^2), or even worse.  I'm not happy with it because it looks ugly and the worst case scenario is running every loop the max number of times.

### So I ask my friend Google
Googling around a bit lead me to suffix trees.
https://en.wikipedia.org/wiki/Longest_repeated_substring_problem 
and 
https://en.wikipedia.org/wiki/Suffix_tree.  This was quite the rabbit hole that I plan on jumping in when I have more time.  The tradeoff is a faster run time versus a lot of memory.  Typically, memory is cheap and time isn't.

### Streams
I think there might be an answer using streams since we can have them running in parallel.
