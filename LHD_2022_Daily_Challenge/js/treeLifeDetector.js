// These lines of code take in the argument from the command line
const argumentValue = process.argv[2];
const treeLifeStatus = Number(argumentValue);

// Write your if statement below here!
if(treeLifeStatus === 0)
{
    console.log('alive');
}
else
{
    console.log('other');
}