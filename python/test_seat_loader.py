from seat_suggestion import *
import unittest
 
class TestJsonLoader(unittest.TestCase):
    sample = """{"rows": ["A", "B", "C", "D", "E", "F", "G"],
 
 "seats" : {"A": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 
            "B": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
            "C": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
            "D": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
            "E": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
            "F": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
            "G": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
           }
}"""
 
    def test_load_seats(self):
        rows, seats = rows_and_seats_from_json(TestJsonLoader.sample)
        self.assertEqual(7, len(rows))
        self.assertEqual(7, len(seats.keys()))
        self.assertEqual(range(1,11), seats.values()[0])
 
if __name__ == '__main__':
    unittest.main()