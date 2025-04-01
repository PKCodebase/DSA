package com.array;

public class SolvingQuestionsWithBrainpower { public long mostPoints(int[][] questions) {
    int n = questions.length;
    long[] dp = new long[n + 1];

    for (int i = n - 1; i >= 0; i--) {
        int nextIndex= i+ questions[i][1] +1;

        long skip = dp[i + 1];
        long take = questions[i][0] + (nextIndex < n ? dp[nextIndex]:0);
        dp[i] = Math.max(take, skip);
    }

    return dp[0];
}
    public static void main(String[] args) {
        SolvingQuestionsWithBrainpower obj = new SolvingQuestionsWithBrainpower();
        int[][] questions = {{3,2},{4,3},{4,4},{2,5}};
        System.out.println(obj.mostPoints(questions));
    }
}
