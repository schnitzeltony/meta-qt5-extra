SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt qt5-translation

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "e262f217e17c14f08c9b9b69b88fef1fd0192694"
PV = "1.0.0"

RDEPENDS:${PN} += "pulseaudio-server"
