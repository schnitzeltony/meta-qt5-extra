SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt qt5-translation

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "7df92bf4b9f7ae0c7774e579914712d4c4ebf0db"
PV = "1.2.0"

RDEPENDS:${PN} += "pulseaudio-server"
