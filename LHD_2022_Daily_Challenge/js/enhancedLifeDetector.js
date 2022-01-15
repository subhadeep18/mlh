// These lines of code take in the argument from the command line
const argumentValue = process.argv[2];
const treeLifeStatus = Number(argumentValue);

// Write your if statement below here!
if(treeLifeStatus === 0)
{
    console.log('alive');
}
else if(treeLifeStatus === 1)
{
    console.log('flowering');
}
else if(treeLifeStatus === 2)
{
    console.log('shedding');
}
else {
    console.log('other');
}