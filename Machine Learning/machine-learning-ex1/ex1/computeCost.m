function J = computeCost(X, y, theta)
%COMPUTECOST Compute cost for linear regression
%   J = COMPUTECOST(X, y, theta) computes the cost of using theta as the
%   parameter for linear regression to fit the data points in X and y

% Initialize some useful values
m = length(y); % number of training examples

% You need to return the following variables correctly 
J = 0;

% Remenber the cost function determines given the theta how accurate is it at
% predicting the outcome by measuring the squared error between the prediction 
% and the correct result (y). For each theta we should be measuring it to every
% training set that we have to get an average performance value

% ====================== YOUR CODE HERE ======================
% Instructions: Compute the cost of a particular choice of theta
%               You should set J to the cost.


J = ( 1 / (2*m)) * sum((( X * theta ) - y ) .^ 2 );

% =========================================================================

end
