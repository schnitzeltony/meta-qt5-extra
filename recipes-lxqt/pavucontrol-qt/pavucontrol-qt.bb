SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt qt5-translation

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "650876762e4e3f715b3804fa45d66a7377c8eea9"
PV = "0.16.0"

RDEPENDS_${PN} += "pulseaudio-server"
