SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "2a2579db78336aeda10159385ac8e2da249b180d"
PV = "0.15.0"

RDEPENDS_${PN} += "pulseaudio-server"
