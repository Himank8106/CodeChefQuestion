# Link - https://www.interviewbit.com/problems/reorder-data-in-log-files/ 

class Solution:

    # @param A : list of strings

    # @return a list of strings

    def reorderLogs(self, A):

        letter=[]

        letter2=[]

        digit=[]

        

        for i in A:

            temp = i.split("-")

            if temp[1].isdigit()== True:

                digit.append(i);

            else:

                letter.append(i);

        

        for i in letter:

             temp = i.split("-",1)

             i=temp[1]+"-"+temp[0]

             letter2.append(i)

        

        letter2.sort()

          

        letter=[]

        for i in letter2:

             temp = i.split("-")

             i=temp[-1]

             for j in range(len(temp)-1):

                i=i+"-"+temp[j]

             letter.append(i)        

             

        return letter + digit 

''' class Solution:
    # @param A : list of strings
    # @return a list of strings
    def reorderLogs(self, A):
        def get_key(log):
            _id, rest = log.split("-", maxsplit = 1)
            return (0, rest, _id) if rest[0].isalpha() else (1, )

        return sorted(A, key = get_key) '''
