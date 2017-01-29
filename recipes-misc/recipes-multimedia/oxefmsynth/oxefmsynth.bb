require ${BPN}.inc

DEPENDS = "${BPN}-native virtual/libx11"

SRC_URI += "file://0002-Makefile.vstlinux-call-native-embedresources.patch"
