class FindLargest
	def find_largest(a, *nums) //*nums is variable argument
		largest = a
		nums.each do |num| //for each num in nums
			if(num > largest)
				largest = num;
			end
		end
		return largest;
	end
end
obj = FindLargest.new
print "The largest number is: ", obj.find_largest(2,3,4,1,5,10,7)