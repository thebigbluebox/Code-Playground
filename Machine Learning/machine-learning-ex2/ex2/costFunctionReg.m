function [J, grad] = costFunctionReg(theta, X, y, lambda)
%COSTFUNCTIONREG Compute cost and gradient for logistic regression with regularization
%   J = COSTFUNCTIONREG(theta, X, y, lambda) computes the cost of using
%   theta as the parameter for regularized logistic regression and the
%   gradient of the cost w.r.t. to the parameters. 

% Initialize some useful values
m = length(y); % number of training examples

% You need to return the following variables correctly 
J = 0;
grad = zeros(size(theta));
gradr = zeros(size(theta));
% ====================== YOUR CODE HERE ======================
% Instructions: Compute the cost of a particular choice of theta.
%               You should set J to the cost.
%               Compute the partial derivatives and set grad to the partial
%               derivatives of the cost w.r.t. each parameter in theta

% Hypothesis X is 118x28 * theta is 28x1 -> 118x1
h = sigmoid(X*theta);

% We define theta(2:end) because theta 0 is not counted in the regularization
cr = lambda/(2*m) * sum( theta(2:end).^2 );
J = (-1/m) * sum( y .* log(h) + (1 - y) .* log1p( - h)) + cr;

% gradr is the regularization component of the gradient we only compute it
% for the terms of 2 and beyond
gradr = ( lambda / m ) * [ 0; theta(2:end) ]; 

% Using the same gradient function from ex1 we can implement here which returns
% a matrix of 1 x 28
grad = ( 1 / m) * sum( X .* repmat(h - y,1,size(theta,1)));

% We need to transpose 1x28 to 28x1 to add to gradr
grad = grad' + gradr;

% =============================================================

end
