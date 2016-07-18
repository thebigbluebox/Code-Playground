function [J, grad] = costFunction(theta, X, y)
%COSTFUNCTION Compute cost and gradient for logistic regression
%   J = COSTFUNCTION(theta, X, y) computes the cost of using theta as the
%   parameter for logistic regression and the gradient of the cost
%   w.r.t. to the parameters.

% Initialize some useful values
m = length(y); % number of training examples

% You need to return the following variables correctly 
J = 0;
grad = zeros(size(theta));

% ====================== YOUR CODE HERE ======================
% Instructions: Compute the cost of a particular choice of theta.
%               You should set J to the cost.
%               Compute the partial derivatives and set grad to the partial
%               derivatives of the cost w.r.t. each parameter in theta
%
% Note: grad should have the same dimensions as theta
%

% Hypothsis -> 100x1 matrix
h = sigmoid(X * theta);
% Cost function -> 1x1 result
J = (1/m).*sum( - y' * log( h ) - ( 1 - y' ) * log1p( - h ));

% Gradient
% We are using repmat because we don't want octave to guess which value
% to dot product on X .* (h - y) so we have repeat this 100x1 -> 100x3 of 3 
% exactly the same valued column one for each theta or we are using the
% first dimension value of theta to known how many times we repeat
grad = ( 1 / m) * sum( X .* repmat(h - y,1,size(theta,1)));

% =============================================================

end
