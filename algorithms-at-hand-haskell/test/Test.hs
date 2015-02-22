module Main where

import Test.Tasty (defaultMain,testGroup,TestTree)

import AlgorithmsAtHandHaskell.Swallow.Test
import AlgorithmsAtHandHaskell.Coconut.Test

main :: IO ()
main = defaultMain tests

tests :: TestTree
tests = testGroup "All Tests"
            [ swallowSuite
            , coconutSuite
            ]
