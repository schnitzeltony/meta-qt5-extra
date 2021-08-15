SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt qt5-translation

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "0d3f3e56a4adcc46a264dcbeeaba2ed534b02ffa"
PV = "0.17.0"

RDEPENDS:${PN} += "pulseaudio-server"
