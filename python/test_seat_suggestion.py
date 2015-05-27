from seat_suggestion import *
import unittest
 
class TestSeatSuggestion(unittest.TestCase):
 
    def test_one_seat_is_allocated_near_the_front(self):
        theater_json = """{"rows" : ["A", "B"], 
            "seats": {"A": [1,2,3,4,5,6,7,8,9,10],
                      "B": [1,2,3,4,5,6,7,8,9,10]}} """
        rows, seats = rows_and_seats_from_json(theater_json)
        booked = ["B2", "B3", "B4", "B5"]
        theater = Theater(rows, seats, booked)
        seat_finder = SeatFinder(theater)
        self.assertTrue(seat_finder.suggest(1) in ["A5", "A6"])
 
 
if __name__ == '__main__':
    unittest.main()