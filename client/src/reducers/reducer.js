import { SET_CURRENT_SONG_URL } from '../actions/actions';
import { initialState } from './initialState';

const reducer = (state = initialState, action) => {
  switch (action.type) {
    case SET_CURRENT_SONG_URL:
      return {
        ...state,
        currentSongURL: action.payload,
      };
    default:
      return state;
  }
};

export default reducer;
