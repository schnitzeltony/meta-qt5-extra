SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "97d2950abe74c0b40dcde1e30c6e5119c0392370"
PV = "0.14.1"

RDEPENDS_${PN} += "pulseaudio-server"
