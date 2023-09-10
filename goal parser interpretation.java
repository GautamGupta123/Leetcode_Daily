class Solution {
    public String interpret(String command) {
        command=command.replace("()","o");
        command=command.replace("(al)","al");
        command=command.replace("G","G");
        return command;
    }
}