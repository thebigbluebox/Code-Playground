function [theta, J_history] = gradientDescent(X, y, theta, alpha, num_iters)
%GRADIENTDESCENT Performs gradient descent to learn theta
%   theta = GRADIENTDESENT(X, y, theta, alpha, num_iters) updates theta by 
%   taking num_iters gradient steps with learning rate alpha

% Initialize some useful values
m = length(y); % number of training examples
J_history = zeros(num_iters, 1);

% Gradient descent will be how we actually get closer to what theta we choose
% to pick.

for iter = 1:num_iters

    % ====================== YOUR CODE HERE ======================
    % Instructions: Perform a single gradient step on the parameter vector
    %               theta. 
    %
    % Hint: While debugging, it can be useful to print out the values
    %       of the cost function (computeCost) and gradient here.
    %
    
    % Since this is only a one parameter hypothesis we can partially derive
    %  theta*X -> x as for theta as x being left over first order derivative
    % X is 100x2 * theta is 2x1 -> 100x1 -> transpose 1x100 * X is 100x2 -> 1x2 transpose -> 2x1
    % Looking at how the multiplication was done, you would see that the multiplication at 
    % the end of X again will provide you a sum of the rows to corresponding to the theta
     theta = theta - ( alpha * ( 1 / m ) * ((X * theta) - y)' * X)';

    % ============================================================

    % Save the cost J in every iteration    
    J_history(iter) = computeCost(X, y, theta);

end

end
