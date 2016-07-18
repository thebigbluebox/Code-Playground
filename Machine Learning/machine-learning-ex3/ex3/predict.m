function p = predict(Theta1, Theta2, X)
%PREDICT Predict the label of an input given a trained neural network
%   p = PREDICT(Theta1, Theta2, X) outputs the predicted label of X given the
%   trained weights of a neural network (Theta1, Theta2)

% Useful values
m = size(X, 1);
num_labels = size(Theta2, 1);

% You need to return the following variables correctly 
p = zeros(size(X, 1), 1);

% ====================== YOUR CODE HERE ======================
% Instructions: Complete the following code to make predictions using
%               your learned neural network. You should set p to a 
%               vector containing labels between 1 to num_labels.
%
% Hint: The max function might come in useful. In particular, the max
%       function can also return the index of the max element, for more
%       information see 'help max'. If your examples are in rows, then, you
%       can use max(A, [], 2) to obtain the max for each row.
%

% Layer 1 input layer we add one column of 1s
a1 = [ones(m, 1),X];

% Layer 2 hidden layer we perform one logistic regession unit
z2 = a1 * Theta1';
a2 = sigmoid(z2);
% Then we add a column of 1s
a2 = [ones(m, 1), a2];

% Layer 3 output layer, which we will use the result to determine the
% the perdiction
z3 = a2 * Theta2';
a3 = sigmoid(z3);

% looking at how max function works, we can get indices by the output of the function
[M,I] = max(a3, [], 2);

% We reassign p to equal the indices which are the predictions
p = I;


% =========================================================================


end
