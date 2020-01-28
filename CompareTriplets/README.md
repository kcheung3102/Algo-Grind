# Compare Triplets

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100  for three categories: problem clarity, originality, and difficulty. 

We define the rating for Alice's challenge to be the triplet a = (a[0], a[1], a[2]), and rating for Bob's challenge to be the triplet b = (b[0], b[1], b[2]).

Your task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

if a[i] > b[i], then Alice is awarded 1 point
if a[i] < b[i], then Bob is awarded 1 point
if a[i] = b[i], then neither person receives a point

**Constraints**
1 <= a[i] <= 100
1<= b[i] <= 100

**Example Output**

5 6 7

3 6 10

**Example Output**

1 1

