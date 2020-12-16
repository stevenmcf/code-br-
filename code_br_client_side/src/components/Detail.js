import {useState, useEffect} from 'react';

const Detail = ({diaryEntry}) => {

    // const [loaded, setLoaded] =useState(false);

    // useEffect(()=> {
    //     if (!diaryEntry){
            
    //     }

    // });

    return(
        <>
        <h2>Latest Stats</h2>
            <h3>Date: {diaryEntry[diaryEntry.length -1].date}</h3>
            <h3>Water Intake: {diaryEntry[diaryEntry.length -1].waterIntake.litres} litres</h3>
            <h3>Sleep time: {diaryEntry[diaryEntry.length -1].sleep.hours} hours</h3>
            <h3>Journal Entry: {diaryEntry[diaryEntry.length -1].journal.journal_entry}</h3>
        </>
    )
};

export default Detail;

// const MapFetchData = diaryEntries.map((diaryEntry) => {
  //   return (
  //     // <diaryEntry diaryEntry={diaryEntry} />
  //     <p>{diaryEntry}</p>
  //   )
  // });