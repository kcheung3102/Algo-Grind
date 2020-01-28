function miniMaxSum(arr) {

    //sort array
    const data = arr.sort();

    const maxSet = data.slice(1); //removes first data in array
    const minSet = data.slice(0, -1); //removes last data in array
    const reducer = (a, total ) => a + total;
    
    const maxNum = maxSet.reduce(reducer, 0); //adds up all the integers in maxSet array
    const minNum = minSet.reduce(reducer, 0); //adds up all the integers in minSet array

    console.log(minNum, maxNum);
    
