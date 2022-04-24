SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt qt5-translation

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "35463e203144c79b8c85a54ef5ea6608eaf07339"
PV = "1.1.0"

RDEPENDS:${PN} += "pulseaudio-server"
