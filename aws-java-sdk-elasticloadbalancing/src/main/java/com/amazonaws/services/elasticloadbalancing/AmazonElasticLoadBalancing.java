/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.elasticloadbalancing.model.*;

/**
 * Interface for accessing AmazonElasticLoadBalancing.
 * Elastic Load Balancing <p>
 * Elastic Load Balancing automatically distributes incoming web traffic
 * across multiple Amazon EC2 instances.
 * </p>
 * <p>
 * All Elastic Load Balancing actions and commands are <i>idempotent</i>
 * , which means that they complete no more than one time. If you repeat
 * a request or a command, the action succeeds with a 200 OK response
 * code.
 * </p>
 * <p>
 * For detailed information about the features of Elastic Load Balancing,
 * see
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenarios.html"> Managing Load Balancers </a>
 * in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 */
public interface AmazonElasticLoadBalancing {

    /**
     * Overrides the default endpoint for this client ("https://elasticloadbalancing.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticloadbalancing.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://elasticloadbalancing.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "elasticloadbalancing.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://elasticloadbalancing.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonElasticLoadBalancing#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Describes the specified load balancer policy types.
     * </p>
     * <p>
     * You can use these policy types with CreateLoadBalancerPolicy to
     * create policy configurations for a load balancer.
     * </p>
     *
     * @param describeLoadBalancerPolicyTypesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerPolicyTypes
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeLoadBalancerPolicyTypes service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyTypeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health
     * state of your back-end instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#healthcheck"> Health Checks </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param configureHealthCheckRequest Container for the necessary
     *           parameters to execute the ConfigureHealthCheck service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the ConfigureHealthCheck service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfigureHealthCheckResult configureHealthCheck(ConfigureHealthCheckRequest configureHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified subnets from the set of configured subnets for
     * the load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load
     * balancer in the removed subnet go into the <code>OutOfService</code>
     * state. Then, the load balancer balances the traffic among the
     * remaining routable subnets.
     * </p>
     *
     * @param detachLoadBalancerFromSubnetsRequest Container for the
     *           necessary parameters to execute the DetachLoadBalancerFromSubnets
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the DetachLoadBalancerFromSubnets service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachLoadBalancerFromSubnetsResult detachLoadBalancerFromSubnets(DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load
     * balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the
     * same key is already associated with the load balancer,
     * <code>AddTags</code> updates its value.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb"> Tagging </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the AddTags service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     * @throws TooManyTagsException
     * @throws DuplicateTagKeysException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddTagsResult addTags(AddTagsRequest addTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as
     * <code>AccessLogs</code> , <code>ConnectionDraining</code> , and
     * <code>CrossZoneLoadBalancing</code> by either enabling or disabling
     * them. Or, you can modify the load balancer attribute
     * <code>ConnectionSettings</code> by specifying an idle connection
     * timeout value for your load balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Elastic Load
     * Balancing Developer Guide</i> :
     * </p>
     * 
     * <ul>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#request-routing"> Cross-Zone Load Balancing </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"> Connection Draining </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/access-log-collection.html"> Access Logs </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#idle-timeout"> Idle Connection Timeout </a>
     * </li>
     * 
     * </ul>
     *
     * @param modifyLoadBalancerAttributesRequest Container for the necessary
     *           parameters to execute the ModifyLoadBalancerAttributes service method
     *           on AmazonElasticLoadBalancing.
     * 
     * @return The response from the ModifyLoadBalancerAttributes service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerAttributeNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates one or more listeners for the specified load balancer. If a
     * listener with the specified port does not already exist, it is
     * created; otherwise, the properties of the new listener must match the
     * properties of the existing listener.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/us-add-listener.html"> Add a Listener to Your Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerListeners service method
     *           on AmazonElasticLoadBalancing.
     * 
     * 
     * @throws InvalidConfigurationRequestException
     * @throws DuplicateListenerException
     * @throws CertificateNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createLoadBalancerListeners(CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     *
     * @param deleteLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerListeners service method
     *           on AmazonElasticLoadBalancing.
     * 
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that
     * follow that of an application-generated cookie. This policy can be
     * associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * CreateLBCookieStickinessPolicy, except that the lifetime of the
     * special Elastic Load Balancing cookie, <code>AWSELB</code> , follows
     * the lifetime of the application-generated cookie specified in the
     * policy configuration. The load balancer only inserts a new stickiness
     * cookie when the application response includes a new application
     * cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the
     * session stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_StickySessions.html#US_EnableStickySessionsAppCookies"> Application-Controlled Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createAppCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateAppCookieStickinessPolicy
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateAppCookieStickinessPolicy service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAppCookieStickinessPolicyResult createAppCookieStickinessPolicy(CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates one or more security groups with your load balancer in a
     * virtual private cloud (VPC). The specified security groups override
     * the previously associated security groups.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/USVPC_ApplySG.html"> Manage Security Groups for Amazon VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param applySecurityGroupsToLoadBalancerRequest Container for the
     *           necessary parameters to execute the ApplySecurityGroupsToLoadBalancer
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the ApplySecurityGroupsToLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws InvalidSecurityGroupException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ApplySecurityGroupsToLoadBalancerResult applySecurityGroupsToLoadBalancer(ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the
     * descriptions of all policies created for the load balancer. If you
     * specify a policy name associated with your load balancer, the action
     * returns the description of that policy. If you don't specify a load
     * balancer name, the action returns descriptions of the specified sample
     * policies, or descriptions of all sample policies. The names of the
     * sample policies have the <code>ELBSample-</code> prefix.
     * </p>
     *
     * @param describeLoadBalancerPoliciesRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancerPolicies service method
     *           on AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeLoadBalancerPolicies service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates, updates, or disables a policy with a listener for the
     * specified load balancer. You can associate multiple policies with a
     * listener.
     * </p>
     *
     * @param setLoadBalancerPoliciesOfListenerRequest Container for the
     *           necessary parameters to execute the SetLoadBalancerPoliciesOfListener
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the SetLoadBalancerPoliciesOfListener
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     * @throws ListenerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetLoadBalancerPoliciesOfListenerResult setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. After an Availability Zone is removed, all
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <code>OutOfService</code> state. Then,
     * the load balancer attempts to equally balance the traffic among its
     * remaining Availability Zones.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_ShrinkLBApp04.html"> Disable an Availability Zone from a Load-Balanced Application </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param disableAvailabilityZonesForLoadBalancerRequest Container for
     *           the necessary parameters to execute the
     *           DisableAvailabilityZonesForLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DisableAvailabilityZonesForLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableAvailabilityZonesForLoadBalancerResult disableAvailabilityZonesForLoadBalancer(DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the state of the specified instances registered with the
     * specified load balancer. If no instances are specified, the call
     * describes the state of all instances registered with the load
     * balancer, not including any terminated instances.
     * </p>
     *
     * @param describeInstanceHealthRequest Container for the necessary
     *           parameters to execute the DescribeInstanceHealth service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeInstanceHealth service method,
     *         as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstanceHealthResult describeInstanceHealth(DescribeInstanceHealthRequest describeInstanceHealthRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     *
     * @param deleteLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerPolicy service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DeleteLoadBalancerPolicy service method,
     *         as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteLoadBalancerPolicyResult deleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load
     * balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that
     * can be applied to the front-end listener or the back-end application
     * server, depending on the policy type.
     * </p>
     *
     * @param createLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerPolicy service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateLoadBalancerPolicy service method,
     *         as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyTypeNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLoadBalancerPolicyResult createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the RemoveTags service method, as returned
     *         by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its
     * registered Availability Zones that contain instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_AddLBAvailabilityZone.html"> Add Availability Zone </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param enableAvailabilityZonesForLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           EnableAvailabilityZonesForLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the EnableAvailabilityZonesForLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableAvailabilityZonesForLoadBalancerResult enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must
     * reconfigure all settings. The DNS name associated with a deleted load
     * balancer are no longer usable. The name and associated DNS record of
     * the deleted load balancer no longer exist and traffic sent to any of
     * its IP addresses is no longer delivered to back-end instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the
     * call to <code>DeleteLoadBalancer</code> still succeeds.
     * </p>
     *
     * @param deleteLoadBalancerRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a load balancer.
     * </p>
     * <p>
     * If the call completes successfully, a new load balancer is created
     * with a unique Domain Name Service (DNS) name. The DNS name includes
     * the name of the AWS region in which the load balancer was created. For
     * example, the DNS name might end with either of the following:
     * </p>
     * 
     * <ul>
     * <li> <code>us-east-1.elb.amazonaws.com</code> </li>
     * <li> <code>us-west-2.elb.amazonaws.com</code> </li>
     * 
     * </ul>
     * <p>
     * For information about the AWS regions supported by Elastic Load
     * Balancing, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region"> Regions and Endpoints </a>
     * in the <i>Amazon Web Services General Reference</i> .
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You
     * can request an increase for the number of load balancers for your
     * account. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-limits.html"> Elastic Load Balancing Limits </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     * <p>
     * Elastic Load Balancing supports load balancing your EC2 instances
     * launched in either the EC2-Classic or EC2-VPC platform. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForEC2.html"> Elastic Load Balancing in EC2-Classic </a> or <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForVPC.html"> Elastic Load Balancing in a VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateLoadBalancer service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidSubnetException
     * @throws TooManyTagsException
     * @throws InvalidConfigurationRequestException
     * @throws DuplicateTagKeysException
     * @throws InvalidSecurityGroupException
     * @throws CertificateNotFoundException
     * @throws InvalidSchemeException
     * @throws DuplicateLoadBalancerNameException
     * @throws TooManyLoadBalancersException
     * @throws SubnetNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces the set of policies associated with the specified port on
     * which the back-end server is listening with a new set of policies. At
     * this time, only the back-end server authentication policy type can be
     * applied to the back-end ports; this policy type is composed of
     * multiple public key policies.
     * </p>
     * <p>
     * Each time you use
     * <code>SetLoadBalancerPoliciesForBackendServer</code> to enable the
     * policies, use the <code>PolicyNames</code> parameter to list the
     * policies that you want to enable.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to
     * verify that the policy is associated with the back-end server.
     * </p>
     *
     * @param setLoadBalancerPoliciesForBackendServerRequest Container for
     *           the necessary parameters to execute the
     *           SetLoadBalancerPoliciesForBackendServer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the SetLoadBalancerPoliciesForBackendServer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetLoadBalancerPoliciesForBackendServerResult setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer.
     * After the instance is deregistered, it no longer receives traffic from
     * the load balancer.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers to verify that the instance is
     * deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register Amazon EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param deregisterInstancesFromLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           DeregisterInstancesFromLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DeregisterInstancesFromLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancer(DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html"> Updating an SSL Certificate for a Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param setLoadBalancerListenerSSLCertificateRequest Container for the
     *           necessary parameters to execute the
     *           SetLoadBalancerListenerSSLCertificate service method on
     *           AmazonElasticLoadBalancing.
     * 
     * 
     * @throws InvalidConfigurationRequestException
     * @throws CertificateNotFoundException
     * @throws LoadBalancerNotFoundException
     * @throws ListenerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setLoadBalancerListenerSSLCertificate(SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     *
     * @param describeLoadBalancerAttributesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerAttributes
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeLoadBalancerAttributes service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerAttributeNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerAttributesResult describeLoadBalancerAttributes(DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes
     * controlled by the lifetime of the browser (user-agent) or a specified
     * expiration period. This policy can be associated only with HTTP/HTTPS
     * listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the back-end server instance for each request.
     * When the load balancer receives a request, it first checks to see if
     * this cookie is present in the request. If so, the load balancer sends
     * the request to the application server specified in the cookie. If not,
     * the load balancer sends the request to a server that is chosen based
     * on the existing load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent
     * requests from the same user to that server. The validity of the cookie
     * is based on the cookie expiration time, which is specified in the
     * policy configuration.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_StickySessions.html#US_EnableStickySessionsLBCookies"> Duration-Based Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLBCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateLBCookieStickinessPolicy
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateLBCookieStickinessPolicy service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLBCookieStickinessPolicyResult createLBCookieStickinessPolicy(CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the
     * specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered
     * subnets. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForVPC.html"> Elastic Load Balancing in Amazon VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param attachLoadBalancerToSubnetsRequest Container for the necessary
     *           parameters to execute the AttachLoadBalancerToSubnets service method
     *           on AmazonElasticLoadBalancing.
     * 
     * @return The response from the AttachLoadBalancerToSubnets service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidSubnetException
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     * @throws SubnetNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachLoadBalancerToSubnetsResult attachLoadBalancerToSubnets(AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the
     * load balancer (EC2-Classic or the same VPC). If you have EC2-Classic
     * instances and a load balancer in a VPC with ClassicLink enabled, you
     * can link the EC2-Classic instances to that VPC and then register the
     * linked EC2-Classic instances with the load balancer in the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes
     * when the request has been registered. Instance registration happens
     * shortly afterwards. To check the state of the registered instances,
     * use DescribeLoadBalancers or DescribeInstanceHealth.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in one of
     * the Availability Zones registered for the load balancer is moved to
     * the <code>OutOfService</code> state. If an Availability Zone is added
     * to the load balancer later, any instances registered with the load
     * balancer move to the <code>InService</code> state.
     * </p>
     * <p>
     * If you stop an instance registered with a load balancer and then
     * start it, the IP addresses associated with the instance changes.
     * Elastic Load Balancing cannot recognize the new IP address, which
     * prevents it from routing traffic to the instances. We recommend that
     * you use the following sequence: stop the instance, deregister the
     * instance, start the instance, and then register the instance. To
     * deregister instances from a load balancer, use
     * DeregisterInstancesFromLoadBalancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param registerInstancesWithLoadBalancerRequest Container for the
     *           necessary parameters to execute the RegisterInstancesWithLoadBalancer
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the RegisterInstancesWithLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     *
     * @param describeLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancers service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeLoadBalancers service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified load balancer policy types.
     * </p>
     * <p>
     * You can use these policy types with CreateLoadBalancerPolicy to
     * create policy configurations for a load balancer.
     * </p>
     * 
     * @return The response from the DescribeLoadBalancerPolicyTypes service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyTypeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the
     * descriptions of all policies created for the load balancer. If you
     * specify a policy name associated with your load balancer, the action
     * returns the description of that policy. If you don't specify a load
     * balancer name, the action returns descriptions of the specified sample
     * policies, or descriptions of all sample policies. The names of the
     * sample policies have the <code>ELBSample-</code> prefix.
     * </p>
     * 
     * @return The response from the DescribeLoadBalancerPolicies service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     * 
     * @return The response from the DescribeLoadBalancers service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancersResult describeLoadBalancers() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        