module Main where

import Data.Array.IArray
  
main :: IO ()
main = do
  putStrLn "cake"
  putStrLn "You fight with the strength of many men sir Knight..."
  putStrLn "You have proved yourself worthy; will you join me?"
  putStrLn "You make me sad. So be it. Come, Patsy."


selectionSort [] = []
selectionSort (x:xs) = selectionSort0 [x] xs


selectionSort0 xs ys = undefined

a :: Array Int Int -> Array Int Int
a = undefined

findMin Array Int Int = Int
findMin arr = findMin0 (arr ! 0) 
findMin0 x [] = x
findMin0 x (y:ys) = let m = if x < y then x else y
                    in findMin0 m ys
