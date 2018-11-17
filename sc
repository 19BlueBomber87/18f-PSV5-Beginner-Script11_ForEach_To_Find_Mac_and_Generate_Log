#Define objects in the function!!
##BRAKESARESWEET#
mkdir c:\kruse\Verbose_Messages
##################################################Function_START#############################################################
function Get-Net_Card_Mac
{#Function Start
#Remove-Item C:\kruse\18f-SUCCESSFUL_MacAdress_Search.txt
#Remove-Item C:\kruse\18f-UNSUCCESSFUL_MacAdress_Search.txt
"SUCCESSFUL_MAC_Address_Searchs 2018-11-15" | Out-File C:\kruse\18f-SUCCESSFUL_MacAdress_Search.txt
"UNSUCCESSFUL_MAC_Address_Searches 2018-11-15" | Out-File  C:\kruse\18f-UNSUCCESSFUL_MacAdress_Search.txt
$BlueBomber = Get-WmiObject -Class Win32_NetworkAdapter 

    foreach($Blue in $BlueBomber)
       {#ForEach_START
         if ($Blue.MACAddress -eq $Null)
            {#START_OF_IF
            Write-Verbose -Message "ERROR_NO_MAC_FOUND!!!!!!!!!!!!!!!!!!!" -Verbose *>&1
                $Blue | Format-List DeviceID, ServiceName, Name
                $Blue | Format-List DeviceID, ServiceName, Name | Out-File C:\kruse\Verbose_Messages\18f-UNSUCCESSFUL_MAC.txt
                $Unsuccessfull = Get-Content C:\kruse\Verbose_Messages\18f-UNSUCCESSFUL_MAC.txt
                $BB = (Get-Date).DateTime
                Add-Content C:\kruse\18f-UNSUCCESSFUL_MacAdress_Search.txt -Value "<----------$BB------------->", $Unsuccessfull, "<--------------------------BrakesAreSweet------------------------>"
             Write-Verbose -Message "Could_Not_Fin_Mac_Address_Use_The-Force_Next_TIME!" -Verbose *>&1
           Start-Sleep 2
            cls
            } #End_OF_IF
        else{ #START_OF_ELSE
                Write-Verbose -Message "We Found a MAC!" -Verbose *>&1
                $Blue | Format-List DeviceID, Name, ServiceName, MACAddress, AdapterType, NetworkADDresses, Speed
                $Blue | Format-List DeviceID, Name, ServiceName, MACAddress, AdapterType, NetworkADDresses, Speed | Out-File C:\kruse\Verbose_Messages\18f-SUCCESSFUL_MAC.txt
                $Sucess= Get-Content C:\kruse\Verbose_Messages\18f-SUCCESSFUL_MAC.txt
                $BB = (Get-Date).DateTime
                Add-Content C:\kruse\18f-SUCCESSFUL_MacAdress_Search.txt -Value "<----------$BB------------->", $Sucess, "<--------------------------BrakesAreSweet------------------------>"
            start-Sleep 3
            }#END_OF_ELSE
cls
        }#ForEach_END

}#Functon_End

Get-Net_Card_Mac 
$BB="MarkK.";$SD="2018-11-15";$PSV5="PowerShellVersion5";$XamplePurpose="Learn, Share and Document";$DJ="Save The Puppies! <3<3<3";$SP="<@:)";$TY="ThankYou For Your Help :)";$MK="UAA Alum, CMC Alum, CNT Student, PowerShell Enthusiast";$TFTSP_FWH="Founder of: The Foundation to Save The Puppies From Write-Host";$Mission="Spread Joy Through Learning PS5";$TFW="ThanksForWatching"
$MyFirstHashTableIsMyDigitalSignature=[Ordered]@{Name="Name: $BB";MarkK="MarkK.:$MK";Date="StarDate: $SD";PSVersion="PowerShellVersionUsed: $PSV5";
Xample="Prupose: $XamplePurpose";Thanks="$TY";TFTSP_FWH="$TFTSP_FWH";Mission="$mission";DJ="$DJ";TFW="$TFW";SP="$SP"}

Cls
Function Blue-Bomber
{
ForEach ($BlueBombersInfo in $MyFirstHashTableIsMyDigitalSignature) 
{
    Write-Verbose -Message ($BlueBombersInfo).Name      -Verbose 6>&1
    Write-Verbose -Message ($BlueBombersInfo).MarkK     -Verbose 5>&1
    Write-Verbose -Message ($BlueBombersInfo).Date      -Verbose 4>&1
    Write-Verbose -Message ($BlueBombersInfo).PSVersion -Verbose 3>&1
    Write-Verbose -Message ($BlueBombersInfo).Xample    -Verbose 2>&1
    Write-Verbose -Message ($BlueBombersInfo).Thanks    -Verbose *>&1
    Write-Verbose -Message ($BlueBombersInfo).TFTSP_FWH -Verbose 2>&1
    Write-Verbose -Message ($BlueBombersInfo).Mission   -Verbose 3>&1
    Write-Verbose -Message ($BlueBombersInfo).DJ        -Verbose 4>&1
    Write-Verbose -Message ($BlueBombersInfo).TFW       -Verbose 5>&1
    Write-Verbose -Message ($BlueBombersInfo).SP        -Verbose 6>&1
}
}
cls
Blue-Bomber
#Notepad C:\kruse\18f-SUCCESSFUL_MacAdress_Search.txt
#NotePad C:\kruse\18f-UNSUCCESSFUL_MacAdress_Search.txt
