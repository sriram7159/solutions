class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        my_set = set()
        for i in range(len(emails)):
            email = emails[i]
            index_of_yet = email.find('@')
            local = email[0:index_of_yet]
            domain = email[index_of_yet:]
            index_of_plus = email.find('+')
            if index_of_plus!=-1:
                local = local[:index_of_plus]
            local = local.replace('.','')
            my_set.add(local+domain)

        return len(my_set)        