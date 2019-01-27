SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "4efc2640fbe50e700a256130774133d1453b92f3"
PV = "0.14.0"

RDEPENDS_${PN} += "pulseaudio-server"
