Access Modifier Rules + Exception

Rule 1:
void test() //Parent
void test() throws RuntimeException // Child  
void test() throws Exception // Child  
void test() throws RuntimeException, Exception // Child

Rule 2 : Checked Exception
void test() throws IOException // Parent
void test() throws Exception // Child

Rule 3 : Narrower Checked Exception
void test() throws Exception // Parent
void test() throws IOException // Child

Rule 4: No Exception
void test() throws Exception //Parent
void test() // Child 

Can you predict the Output  ??