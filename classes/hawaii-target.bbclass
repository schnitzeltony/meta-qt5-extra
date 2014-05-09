EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release"

# target files cause that our dependencies do not find us
do_install_append() {
	rm -f ${D}/${libdir}/cmake/*/*Targets-release.cmake
}
