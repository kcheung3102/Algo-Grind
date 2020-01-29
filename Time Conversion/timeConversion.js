//Converts from 12- hour clock to 24 hour clock

function timeConversion(s) {
 //gets PM or AM at the end of the string
 let amPM = s.slice(-2);
 //[hh ,mm ,ss, PM or AM]
 let timeArr = s.slice(0, -2).split(':');
 
 //edge case for 12AM
  if(amPM === 'AM' && timeArr[0] === '12' ) {
      timeArr[0] = '00';
  } else if( amPM === 'PM') {
      timeArr[0] =(timeArr[0] % 12) + 12;
  }
    return timeArr.join(':');

}
