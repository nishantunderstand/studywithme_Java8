Access Modifier Rules : Visibility cannot be reduced , It can be Increased.
@Override

Exception Rules
Rule 1: Unchecked Exceptions
Rule 2: Checked Exception (Cannot throw a broader checked exception.)
Rule 3: Narrower Checked Exception
Rule 4: No Exception

Deep Explain :

Rule 1:
void test() //Parent
void test() throws RuntimeException // Child  ✅ Valid.
void test() throws Exception // Child  ❌ Invalid. | Compile Time Erorr
void test() throws RuntimeException, Exception // Child  ❌ Invalid.

Rule 2 : Checked Exception
void test() throws IOException // Parent
void test() throws Exception // Child ❌ Invalid. // Compile Time Error

Rule 3 : Narrower Checked Exception
void test() throws Exception // Parent
void test() throws IOException // Child  ✅ Valid

Rule 4: No Exception
void test() throws Exception //Parent
void test() // Child ✅ Valid.


---

Do i need to mention Exception Signature in main as well??