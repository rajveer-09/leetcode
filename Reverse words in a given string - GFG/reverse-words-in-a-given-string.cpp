//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
    public:
    //Function to reverse words in a given string.
    string reverseWords(string S) 
    { 
        // code here 
        stringstream ss(S);
        string word;
        vector<string> words;

        while (getline(ss, word, '.')) {
            words.push_back(word);
        }

        // Reversing the vector of words
        reverse(words.begin(), words.end());

        // Joining the words to form the reversed string
        string result;
        for (const string& w : words) {
            result += w + ".";
        }

        // Removing the trailing dot
        result.pop_back();

        return result;
    } 
};

//{ Driver Code Starts.
int main() 
{
    int t;
    cin >> t;
    while (t--) 
    {
        string s;
        cin >> s;
        Solution obj;
        cout<<obj.reverseWords(s)<<endl;
    }
}
// } Driver Code Ends