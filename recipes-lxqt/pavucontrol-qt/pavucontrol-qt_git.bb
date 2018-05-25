SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "fe41fed80452c1788f03d9746921f5962bacad4a"
PV = "0.4.0"

RDEPENDS_${PN} += "pulseaudio-server"
