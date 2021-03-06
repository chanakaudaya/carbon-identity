/*
*  Copyright (c) 2005-2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.identity.user.account.connector;

import org.wso2.carbon.identity.user.account.connector.exception.UserAccountConnectorException;

public interface UserAccountConnector {

    /**
     * Create new user account association
     *
     * @param userName
     * @param password
     * @throws org.wso2.carbon.identity.user.account.connector.exception.UserAccountConnectorException
     */
    void connectUserAccount(String userName, String password) throws UserAccountConnectorException;

    /**
     * Delete an existing user account association
     *
     * @param userName
     * @throws UserAccountConnectorException
     */
    void deleteUserAccountConnection(String userName) throws UserAccountConnectorException;

    /**
     * Get all associated accounts of the logged in user
     *
     * @return
     * @throws UserAccountConnectorException
     */
    String[] getConnectedAccountsOfUser() throws UserAccountConnectorException;

    /**
     * Switch logged in user account to the required associated user account
     *
     * @param userName
     * @return
     * @throws UserAccountConnectorException
     */
    boolean switchLoggedInUser(String userName) throws UserAccountConnectorException;

}
