require ${BPN}.inc

inherit native

CMAKE_HIDE_ERROR[1] = "KF5CoreAddons, -s/usr/lib/li, -S${STAGING_LIBDIR_NATIVE}/lib"
CMAKE_HIDE_ERROR[2] = "KF5CoreAddons, -s/usr/include, -S${STAGING_INCDIR_NATIVE}"
CMAKE_HIDE_ERROR[3] = "KF5CoreAddons, -s/usr/bin, -S${STAGING_BINDIR_NATIVE}"

